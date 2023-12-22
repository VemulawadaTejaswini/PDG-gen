import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int max = 0;
		
		for(int i=0; i<n; i++){
		    String str1 = str.substring(0,i+1);
		    String str2 = str.substring(i+1);
		    int ans = 0;
		    boolean[] ar1 = new boolean[26];
            boolean[] ar2 = new boolean[26];
		    
		    for(int j=0; j<i+1; j++){
		        ar1[str1.charAt(j)-'a']=true;
		    }
		    
		    for(int j=0;j<n-i-1;j++){
                ar2[str2.charAt(j)-'a']=true;
            }
		    
		    for(int j=0;j<26;j++){
                if(ar1[j]&&ar2[j]){
                    ans++;
                }
            }
            max = Math.max(max,ans);
		}
		
		System.out.println(max);   
        
    }
}
