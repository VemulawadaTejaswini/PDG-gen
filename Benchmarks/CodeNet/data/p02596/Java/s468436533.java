import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int s=-1;
 for(int i=1;i<=19&&s==-1;i++){String p="";
for(int j=0;j<i;j++){
    p=p+"1";}
long d=Long.parseLong(p);
d=d*7;
if (d%K==0){s=i;}
 }
System.out.println(s);
    }

}