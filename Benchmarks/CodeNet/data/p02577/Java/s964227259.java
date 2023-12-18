#include <iostream>

using namespace std;

int main()
{
  long long n;
   cin>>n;

   long sum = 0;

   while(n != 0){
    sum += n % 10;
    n = n/10;
   }

   if(sum % 9 == 0){
    cout<<"YES";
   }
   else{
    cout<<"NO";
   }
}
