import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    ArrayList<Integer> list = new ArrayList<Integer>();
    int j=0;
    list.add(0);
    for(int i=0;i<a.length();i++){
      char c = a.charAt(i);
      if(c=='A'||c=='G'||c=='C'||c=='T'){
        j++;
        list.add(j);
      }else{
        list.add(j);
        j=0;
      }
    }
    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list.get(0));
  }
}