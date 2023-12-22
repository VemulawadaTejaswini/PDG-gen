import java.util.*;
public class Main {
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	String x=sc.nextLine();//次の行に行く方法？？？
	Map<String, Long> log = new HashMap<String, Long>();
	long r=0L;


	for(int i=0;i<N;i++){
		String s=sc.nextLine();
		s=sort(s);
		
		if(log.containsKey(s)){
			r+=log.get(s);
			log.put(s,log.get(s)+1);
		}else{
			log.put(s,1L);
		}
	}
	System.out.println(r);
 }
 
 public static String sort(String s){
	char[] ana=new char[10];
	for(int j=0;j<10;j++){
		String k=s.substring(j,j+1);
		 ana[j]=k.toCharArray()[0];
	}
	Arrays.sort(ana);
	return String.valueOf(ana);
 }
 
}