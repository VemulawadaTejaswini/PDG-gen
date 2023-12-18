//g++  7.4.0

#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
#define MOD 1000000007

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    ll T = 1;
    while(T--)
    {
        ll N,K; cin>>N>>K;
        ll arr[N];
        ll ans = 1;
        
        for(ll i=0;i<N;++i)
            cin>>arr[i];
        
        sort(arr,arr + N);
        
        ll pos = 0;
        ll neg = 0;
        ll zero = 0;
        ll pos_start = -1;
        ll pos_end = -1;
        ll neg_start = -1;
        ll neg_end = -1;
        
        for(ll i=0;i<N;++i)
        {
            if(arr[i] >= 0)
            {
                if(pos_start == -1)
                {
                    pos_start = i;
                    pos_end = i;
                }
                else
                    pos_end = i;
                
                pos++;
            }
            else if(arr[i] < 0)
            {
                if(neg_start == -1)
                {
                    neg_start = i;
                    neg_end = i;
                }
                else
                    neg_end = i;
                
                neg++;
            }
        
        }
        
        if(pos == 0)
        {
            if(K%2)
            {
                //cout<<"Hello"<<endl;
                for(ll i=neg_end;i>=(neg_end - K + 1);--i)
                {
                    //cout<<arr[i]<<" ";
                    ans = ((ans % MOD) * (((arr[i] % MOD) + MOD) % MOD)) % MOD;
                    //cout<<ans<<endl;
                }
            }
            else
            {
                for(ll i=0;i<K;++i)
                    ans = ((ans % MOD) * (((arr[i] % MOD) + MOD) % MOD)) % MOD;
            }
            
            cout<<ans<<endl;
            continue;
        }
        
        /*if(neg == 0)
        {
            for(ll i=(N - 1);i>(N - K);--i) //to check
                ans = (ans * arr[i]) % MOD;
                
            cout<<ans<<endl;
            
            continue;
        }*/
        
        ll i = 0;
        ll j = N - 1;
        
        while((K > 1) && (i < neg_end) && (j > pos_start))
        {
            //cout<<i<<endl;
            
            ll fwd = arr[i] * arr[i + 1];
            ll bwd = arr[j] * arr[j - 1];
            
            if(fwd > bwd)
            {
                i += 2;
                ans = ((ans % MOD) * (fwd % MOD)) % MOD;
                K -= 2;
            }
            else
            {
                ans = ((ans % MOD) * (arr[j] % MOD)) % MOD;
                j--;
                K--;
            }
            
        }
        
        //cout<<ans<<endl;
        
        //cout<<K<<" "<<i<<" "<<j<<endl;
        
        while((K > 1) && (i < neg_end))
        {
            ll fwd = arr[i] * arr[i + 1];
            //cout<<fwd<<endl;
            i += 2;
            ans = ((ans % MOD) * (fwd % MOD)) % MOD;
            K -= 2;
        }
        
        //cout<<K<<endl;
        
        while(K && (j >= pos_start))
        {
            ans = ((ans % MOD) * (arr[j] % MOD)) % MOD;
            j--;
            K--;
        }
        
        //cout<<ans<<endl;
        if(K)//edge case
        {
            ans = ((ans % MOD) * (((arr[i] % MOD) + MOD) % MOD)) % MOD;
        }
        
        cout<<ans<<endl;
    }
}