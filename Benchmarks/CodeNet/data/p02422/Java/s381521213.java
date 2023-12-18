import java.util.Scanner;
  
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
      String stroutput = "";
      String meirei = sc.next();
      if(meirei.equals("print")){
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int x = a; x <= b; x++){
          char c = str.charAt(x);
          stroutput += c;
        }
      	System.out.println(stroutput);
      }else if(meirei.equals("reverse")){
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int x = 0; x < a; x++){
          char c = str.charAt(x);
          stroutput += c;
        }
        for(int x = b; x >= a; x--){
          char c = str.charAt(x);
          stroutput += c;
        }
        for(int x = b+1; x < str.length(); x++){
          char c = str.charAt(x);
          stroutput += c;
        }
        str = stroutput;
      }else{
        int a = sc.nextInt();
        int b = sc.nextInt();
        String p = sc.next();
        for(int x = 0; x < a; x++){
          char c = str.charAt(x);
          stroutput += c;
        }
        for(int x = 0; x <= b-a; x++){
          char c = p.charAt(x);
          stroutput += c;
        }
        for(int x = b+1; x < str.length(); x++){
          char c = str.charAt(x);
          stroutput += c;
        }
        str = stroutput;
      }
    }
  }
}
