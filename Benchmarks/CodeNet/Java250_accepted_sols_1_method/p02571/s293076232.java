import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String  S=sc.next();
    String  T=sc.next();
    String []Ss = S.split("");
    String []Ts = T.split("");


    int Sum=0;
    int Ans=1001;
for (int i=0;i<Ss.length-Ts.length+1 ;i++){
  for (int j=0;j<Ts.length ;j++) {
     if(!(Ss[i+j].equals(Ts[j]))){
       Sum++;
     }
  }
  if(Ans>Sum){
    Ans=Sum;
  }
  Sum=0;

}
System.out.println(Ans);
}
}
