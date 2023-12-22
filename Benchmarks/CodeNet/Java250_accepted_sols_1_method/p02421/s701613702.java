import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tarou=0,hanako=0;
        int r;
        for(int i=0;i<n;i++){
            r=sc.next().compareToIgnoreCase(sc.next());
            if(r<0)hanako+=3;
            else if(r==0){
                tarou++;
                hanako++;
            }else tarou+=3;
        }
        System.out.printf("%d %d\n",tarou,hanako);
    }
}

