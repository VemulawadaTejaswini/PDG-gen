
import java.util.Scanner;

public class Main {

                 public static void main(String[] args) {
                                  Scanner ob = new Scanner(System.in);
                                  String a[] = new String[1000000];
                                  int n = ob.nextInt();
                               //   a[0]="AC";
                                //  if(a[0]=="AC"){System.out.println("i");}
                                       int c1=0,c2=0,c3=0,c4=0;
                                  for (int i = 0; i < n; i++) {
                                                   a[i] = ob.next();
                                                    if("AC".equals(a[i])){c1++;}
                                                   if("WA".equals(a[i])){c2++;}
                                                   if("TLE".equals(a[i])){c3++;}
                                                   if("RE".equals(a[i])){c4++;}
                                  }
                                  //for(int i=0;i<n;i++){System.out.println(a[i]);}
                             
                                  System.out.println("AC x "+c1);
                                  System.out.println("WA x "+c2);
                                  System.out.println("TLE x "+c3);
                                  System.out.println("RE x "+c4);
                 }

}
