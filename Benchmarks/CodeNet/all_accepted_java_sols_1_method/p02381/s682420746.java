import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
    int n=0,i,j;
    double sum=0,a=0,b=0;
    n=sc.nextInt();
    if(n==0){
        break;
    }
    int []d =new int[n];
    for(i=0;i<n;i++){
        d[i]=sc.nextInt();
        sum=sum+d[i];
    }
    sum=sum/n;
    for(j=0;j<n;j++){
        a = a+ Math.pow(d[j]-sum,2);
    }
        a= a/n;
        b=Math.sqrt(a);
    
    System.out.println(b);


}

    }
}
