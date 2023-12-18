import java.util.Scanner;


 class  Main {
    static public  void  main (String[] av){
     int  b;
     int sum=0;
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int a[]= new int[n];
        int v;
        for(int  i=0;i<n;i++){
            v=sc.nextInt();
            a[i]=v;
        }
        
int n2=sc.nextInt();
for (int i=0;i<n2;i++){
    int x=sc.nextInt();
    for (int j=0;j<n;j++){
    if (a[j]==x){
        sum++;
        break;
    }
}
}
System.out.println(sum);


        }

}
