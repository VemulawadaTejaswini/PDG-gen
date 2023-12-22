import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,a=0,b=0;
        String s1,s2;
        n=sc.nextInt();
        
        for(i=0;i<n;i++) {
            s1=sc.next();
            s2=sc.next();
            
            if(s1.compareTo(s2)>0) {
                a+=3;
            }
            else if(s1.compareTo(s2)<0) {
                b+=3;
            }
            else if(s1.compareTo(s2)==0) {
                a+=1;
                b+=1;
            }
        }
        System.out.println(a+" "+b);
        
        sc.close();
    }
}

