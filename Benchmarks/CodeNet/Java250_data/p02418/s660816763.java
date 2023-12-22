import java.util.*;


class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    String s=sc.nextLine(),p=sc.nextLine();
    char[] l1 = s.toCharArray();
    char[] l2 = p.toCharArray();

   int flag=0;
   for(int i=0;i<s.length();i++){
	   if(flag>=p.length()) break; 	
	if(l1[i]==l2[0]) {
		int temp=i;
	      for(int j=0;j<p.length();j++){ 
			if(temp==s.length())temp=0;
			if(l2[j]!=l1[temp]){
				flag=0;
				break; 
			}
			temp++;flag++;
			}
	    }
	   }
   if(flag==0){System.out.println("No");
   }
   else System.out.println("Yes");
	  }
 }
    