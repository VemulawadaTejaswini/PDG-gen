import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
for(int i=0; ;i++){
 int H=sc.nextInt();
int W=sc.nextInt();
if(H==0 && W==0)break;
for(int j=0;j<H;j++){
for(int k=0;k<W;k++){
System.out.print("#");
}
System.out.println("");
}
System.out.println("");
}
}
}

