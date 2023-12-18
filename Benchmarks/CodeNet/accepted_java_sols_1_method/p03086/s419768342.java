import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
      	int count=0;int tmp=0;
      	String ATCG[]={"A","C","G","T"};
      	for( String atcg:ATCG){
          s=s.replace(atcg,"0");
        }
      	for(int i=0;i<s.length();i++){
         if(s.charAt(i)=='0'){
           tmp+=1;
         }else{
           count=Math.max(tmp,count);
           tmp=0;
         }
        }
        count=Math.max(tmp,count);
		System.out.println(count);
		
		
	}
}
