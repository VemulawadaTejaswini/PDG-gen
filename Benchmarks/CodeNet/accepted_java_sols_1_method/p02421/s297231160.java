import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int taro=0 ,hanako=0,x;
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            x=sc.next().compareTo(sc.next());
            if(x<0)hanako+=3;
            else if (x==0){hanako++;taro++;}
            else taro+=3;
        }
        
        System.out.printf("%d %d\n",taro,hanako);
    }
}

