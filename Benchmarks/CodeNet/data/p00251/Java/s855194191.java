
public class HelloWorld {
  public static void main (String[] args) {
    System.out.println("Hello World !!");
int i=0,a;
Scanner scan = new Scanner(System.in);
for(a=0;a<10;a++){
    String str = scan.next();
i += Integer.parseInt(str);
}
System.out.printfln(+i);
  }
}