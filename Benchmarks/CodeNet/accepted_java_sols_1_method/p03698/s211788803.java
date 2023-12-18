import java.util.* ; 
class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    String s = scan.next() ;
    char arr[] = s.toCharArray() ;
    ArrayList<Character> a = new ArrayList<>();
    for (int i = 0 ; i <arr.length ; i++){
        if(!a.contains(arr[i])){
          a.add(arr[i]);
        }
    }
   // System.out.println(arr.length);
   // System.out.println(a.size()) ;
    if(a.size() == arr.length){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }
     
  }
}
