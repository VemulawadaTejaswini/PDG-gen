import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
long K= scan.nextLong();
long N=100;
int i=0;
while(N<K){

     N= (long) (N*1.01);
    i=i+1;



}

System.out.println(i);

        // write your code here
    }
}
