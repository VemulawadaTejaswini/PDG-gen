import java.util.*;

public class Main{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    String b[]= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    String[] sp =S.split("");
    for(int i=0; i<sp.length; i++){
	for(int j=0; j<26; j++){
	    if(sp[i].equals(b[j])){
		sp[i]=b[(j+N)%26];
		System.out.print(sp[i]);
		break;
	    }
	}
    }
    System.out.println();
    }
}
