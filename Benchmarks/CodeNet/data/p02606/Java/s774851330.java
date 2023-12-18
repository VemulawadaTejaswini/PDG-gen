import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int l=scan.nextInt();
int r=scan.nextInt();
int d=scan.nextInt();

int i=0;
int sum=0;
for(i=l;i<r+1;i++){
    if(i%d==0){
        sum=sum+1;
    }
}

System.out.println(sum);


}
}