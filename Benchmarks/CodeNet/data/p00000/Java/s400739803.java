#define For 


For GNU C++
#include <iostream>
using namespace std;
int main()
{
    int a,b;
    cin >> a >> b;
    cout << a+b << endl;
    return 0;
}

For GNU C
#include <stdio.h>
int main()
{
    int a,b;
    scanf("%d %d",&a, &b);
    printf("%d",a+b);
    return 0;
}â

For Java
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[]) throws Exception
    {
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt(),b=cin.nextInt();
        System.out.println(a+b);
    }
}