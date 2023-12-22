import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
          int sum=0;
                String s = sc.next();
                if(s.equals("-"))
                break;
                int m = sc.nextInt();
                for(int i=0;i<m;i++){
                  int h=sc.nextInt();
                  sum+=h;
                }
                String[] d=s.split("");
                int l=sum%d.length;
                for(int i=l;i<d.length;i++){
                  System.out.printf("%s",d[i]);
                }
                for(int i=0;i<l;i++){
                  System.out.printf("%s",d[i]);
                }
                System.out.println("");
              }
              sc.close();
    }
}
