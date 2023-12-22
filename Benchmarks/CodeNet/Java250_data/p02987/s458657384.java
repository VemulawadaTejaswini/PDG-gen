import java.util.Scanner;

class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String S = sc.next();
  String[] Ssplit = S.split("");
  int ans = 0;
  int ans1 = 0;
  int ans2 = 0;
  int ans3 = 0;
  if(Ssplit[0].equals(Ssplit[1]))
  ans = ans + 1;
  if(Ssplit[0].equals(Ssplit[2]))
  ans = ans + 1;
  if(Ssplit[0].equals(Ssplit[3]))
  ans = ans + 1;
  if(ans != 1)
  System.out.println("No");
  
  if(ans == 1){
  if(Ssplit[1].equals(Ssplit[0]))
  ans1 = ans1 + 1;
  if(Ssplit[1].equals(Ssplit[2]))
  ans1 = ans1 + 1;
  if(Ssplit[1].equals(Ssplit[3]))
  ans1 = ans1 + 1;
  if(ans1 != 1)
  System.out.println("No");
  }
  
  if(ans1 == 1){
  if(Ssplit[2].equals(Ssplit[0]))
  ans2 = ans2 + 1;
  if(Ssplit[2].equals(Ssplit[1]))
  ans2 = ans2 + 1;
  if(Ssplit[2].equals(Ssplit[3]))
  ans2 = ans2 + 1;
  if(ans2 != 1)
  System.out.println("No");
  }

  
  if(ans == 1 & ans1 == 1 & ans2 == 1 )
  System.out.println("Yes");
}
}