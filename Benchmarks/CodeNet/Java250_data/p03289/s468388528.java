import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    String str = stdIn.next();
    boolean ans = true;

    if(str.charAt(0) != 'A')
      ans = false;
    
    if(!check(str, 1))
      ans = false;

    int cnt = 0;
    for(int i = 2; i < str.length() - 1; i++){
      if(str.charAt(i) == 'C')
        cnt++;
      if(!check(str, i))
      ans = false;
    }

    if(!check(str, str.length() - 1))
      ans = false;
   
    if(cnt != 1)
      ans = false;

    if(ans)
      System.out.println("AC");
    else
      System.out.println("WA");
  }

  public static boolean check(String str, int i){
    switch(str.charAt(i)){
    case 'B' : return false;
    case 'D' : return false;
    case 'E' : return false;
    case 'F' : return false;
    case 'G' : return false;
    case 'H' : return false;
    case 'I' : return false;
    case 'J' : return false;
    case 'K' : return false;
    case 'L' : return false;
    case 'M' : return false;
    case 'N' : return false;
    case 'O' : return false;
    case 'P' : return false;
    case 'Q' : return false;
    case 'R' : return false;
    case 'S' : return false;
    case 'T' : return false;
    case 'U' : return false;
    case 'V' : return false;
    case 'W' : return false;
    case 'X' : return false;
    case 'Y' : return false;
    case 'Z' : return false;
    }

    return true;
  }
}