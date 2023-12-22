import java.util.Scanner;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] strAry = str.split("");
    
    int count = 0;
    if(strAry[0].equals("1")) count++;
    if(strAry[1].equals("1")) count++;
    if(strAry[2].equals("1")) count++;    
    System.out.println(count);
    
    return;
  }
}