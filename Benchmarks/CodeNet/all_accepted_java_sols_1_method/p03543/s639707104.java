import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
	int A = scan.nextInt();
    String s = Integer.toString(A);
    String s1 = s.substring(0,3);
    String s2 = s.substring(1,4);
    String[] s3  = {s1,s2};
    char ch[] = s.toCharArray();
    ArrayList<Character> a = new ArrayList<>();
    for(int i = 0 ; i  < 2 ; i++){
     	for(int j = 0 ; j < 3 ; j++){
           if(!a.contains(s3[i].toCharArray()[j])){
        	a.add(s3[i].toCharArray()[j]);
      		}
        }
      if(a.size()<= 1){
      	System.out.println("Yes");
        break ;
       }
      a.removeAll(a);
    }
    if(a.size()== 0 ){
      System.out.println("No");
    }
    
    
  }
}
