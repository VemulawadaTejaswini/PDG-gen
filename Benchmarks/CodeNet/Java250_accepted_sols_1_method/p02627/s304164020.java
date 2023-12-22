import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().toCharArray()[0];
    char a = 'a';
    Set<Character> set = new HashSet<>();
    for(int i=0;i<26;i++){
      set.add((char)(a+i));
    }
    if(set.contains(ch)){
      System.out.println('a');
    }else{
      System.out.println('A');
    }
    
  }
}