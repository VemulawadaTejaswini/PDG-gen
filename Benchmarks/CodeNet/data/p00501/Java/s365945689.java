import java.util.*;
public class Main {
   public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  char[] s = sc.next().toCharArray();
	  int count=0;
	  for(int i=0;i<n;i++){
		  char[] s2 = sc.next().toCharArray();
		  boolean judge=false;
		  for(int k=0;k<s2.length;k++){
			  if(s[0]==s2[k]){
			  for(int j=i+1;j<s2.length;j++){
				  if(s[1]==s2[j]){
					  int aid=j-k;
					  if(s2.length<=j+aid*(s.length-1)) break;
					  int g=j;
					  for(int l=2;l<s.length;l++){
						  g+=aid;
						  if(s[l]!=s2[g]) break;
						  if(l==s.length-1){
							  count+=1;
							  judge=true;
						  }
					  }
					  if(judge==true) break;
				  }
			  }
			  }
		  }
		  if(judge==true) break;
	  }
	  System.out.println(count);
   }
}