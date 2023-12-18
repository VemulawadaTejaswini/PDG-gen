import java.util.Scanner;
public class Main{
public static void main(String args[]){
  Scanner scan=new Scanner(System.in);
long row=scan.nextLong();
long col=scan.nextLong();
long pro=row*col;
if(row==1 || col==1){
  System.out.println("1");
}
else if (pro%2==0){
  System.out.println(pro/2);
}
else{
  System.out.println((pro+1)/2);
}
}
}
