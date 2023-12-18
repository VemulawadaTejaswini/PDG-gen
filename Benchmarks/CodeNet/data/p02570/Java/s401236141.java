#include <iostream>
#include <string>
#include <cstring>
#include <algorithm>
#include <vector>
#include <stack>
#include <queue>
#include <deque>
#define fo(n) for( int i = 0 ; i < n ; i++ )
#define sci(n) scanf("%d",&n)
#define msci(m,n) scanf("%d %d",&m,&n)
#define mod 1000000007


#define ll long long int


using namespace std;

int Iterbinarysearch(int a[],int n,int x)
{
    int l=0,h=n-1;
	int res=-1;
    while(l<=h)
    {
        int mid=l+(h-l)/2;
        if(x>=a[mid])
		{
			res=mid;
			l=mid+1;
		}
		else
		h=mid-1;
    }
    return res;

}
// int Recurbinarysearch(int a[],int n,int x,int i,int j)
// {
//     if(i>j) return-1;
//     if(n>0)
//     {
//         int mid=i+(j-i)/2;
//         if(x==a[mid]) return mid;
//         else if(x>a[mid]) return Recurbinarysearch(a,n,x,mid+1,j);
//         else return Recurbinarysearch(a,n,x,i,mid-1);
//     }
    
// }

// int* func(int a[],int n)
// {
//     int k=1;
//     for(int i=0;i<n;i++)
//     a[i] +=k;
//     return a;
// } 



// bool isPossibleTriangle(int arr[], int n) 
//    {
//     if (n < 3) 
//     return false; 
  
   
//     sort(arr, arr + n); 
  
//     for (int i = 0; i < n - 2; i++) 
  
    
//         if (arr[i] + arr[i + 1] > arr[i + 2]) 
//         {
//             s1.insert(arr[i]);
//             s1.insert(arr[i+1]);
//             s1.insert(arr[i+2]);

            
//         }
       

//           cout<<"\n";
//         if(s1.size()!=0)
             
//         return true;
    
//         else
//      return false; 
// } 
int gcd (int a, int b) {
    while (b) {
        a %= b;
        swap(a, b);
    }
    return a;
}
int lcm (int a, int b) {
    return a / gcd(a, b) * b;
}


int main()
{
    ios_base::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);   
 /*int k=Recurbinarysearch(a,n,x,0,n-1);
(k==-1)?cout<<"Not found":cout<<"found at "<<k;*/
////////////////////////////////////////////////////////////////
//  if (__cplusplus == 201703L)
//       std::cout << "C++17" << endl;
//    else if (__cplusplus == 201402L)
//       std::cout << "C++14" << endl;
//    else if (__cplusplus == 201103L)
//       std::cout << "C++11" << endl;
//    else if (__cplusplus == 199711L)
//       std::cout << "C++98" << endl;
//    else
//       std::cout << "pre-standard C++" << endl;



 ll d;
 cin>>d;
 ll t;
 cin>>t;
 ll s;
 cin>>s;
 ll k=d/s;
 if(k<=t)
 cout<<"Yes"<<"\n";
 else
  cout<<"No"<<"\n";
	
   
 return 0;
}


