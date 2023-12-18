import java.util.Scanner;

class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int ans = 0;
  String[] Psplit = new String[n];
  for(int i = 0; i < n;i++){
    Psplit[i] = sc.next();
  }
  
  for(int i = 0; i < n-2;i++){
  if(Integer.parseInt(Psplit[i]) < Integer.parseInt(Psplit[i+1]) && Integer.parseInt(Psplit[i+1]) < Integer.parseInt(Psplit[i+2])){
   ans = ans + 1;
  }
  if(Integer.parseInt(Psplit[i]) > Integer.parseInt(Psplit[i+1]) && Integer.parseInt(Psplit[i+1]) > Integer.parseInt(Psplit[i+2])){
   ans = ans + 1;
  }
  }
  System.out.println(ans);
 }
}