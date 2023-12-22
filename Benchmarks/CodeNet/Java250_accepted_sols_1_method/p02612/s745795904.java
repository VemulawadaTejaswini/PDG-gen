import java.util.Scanner;

public class Main {

                 public static void main(String[] args) {
                                  Scanner ob = new Scanner(System.in);

                                  int n = ob.nextInt();
                                  for(int i=1;i<1000;i++)
                                  {
                                  if(i*1000==n){System.out.println(0);break;}
                                  if((i*1000)>n)
                                  {
                                                   System.out.println((int)Math.abs((i*1000)-n));
                                                   break;
                                  }
                                  }
                              //    System.out.println((int)Math.abs(n-1000));
                 }

}
