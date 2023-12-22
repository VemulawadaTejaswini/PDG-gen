import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //char[] alpha = new char[26];
    //char c = 'a';
    char a = 'A';
    //for (int i = 0; i < 26; i++){
    //    alphabet[i] = c++;
    //}
    int num = Integer.parseInt(scan.nextLine()) % 26;
    char[] pre = scan.nextLine().toCharArray();
    char[] now = new char[pre.length];
    for(int i = 0;i < pre.length;i ++){
      now[i] = (char)((num + pre[i] - a) % 26 + a); 
    }
    System.out.println(String.valueOf(now));
  }
}