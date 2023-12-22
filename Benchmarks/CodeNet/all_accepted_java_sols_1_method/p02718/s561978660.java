import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int sum=0;
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(!(4*m*a[i]<sum)){
                ans++;
            }
        }
        System.out.println(ans<m?"No":"Yes");
    }
}