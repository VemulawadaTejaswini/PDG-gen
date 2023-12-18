import java.util.Scanner;
      
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str[] = new String[1200];
    int x = 0;
    int anum = Character.getNumericValue('a');
    int znum = Character.getNumericValue('z');
    int num = znum - anum;
    int answer[] = new int[num +1];
    for(int i = 0 ; i <= num ; i++){
      answer[i] = 0;
    }
      
    while(sc.hasNextLine()){
      str[x] = sc.nextLine();
      for(int i = 0 ; i < str[x].length() ; i++){
        char c = str[x].charAt(i);
        if('A' <= c && c <= 'Z'){
          c += 'a' - 'A';
        }
        int inum = Character.getNumericValue(c);
        if('a' <= c && c <= 'z'){
          answer[inum - anum] += 1;
        }
      }
      x += 1;
    }
      
    for(int i= 0; i <= num; i++){
      char ch = (char)('a'+i);
      System.out.println(String.valueOf(ch)+" : "+answer[i]);
    }
  }
}
