import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,j,n;
    Scanner sca=new Scanner(System.in);
    List<String> dic=new ArrayList<>();
    String yomi;
    n=sca.nextInt();
    for(i=0;i<n;i++){
    	yomi=sca.next();
    	if(yomi.equals("insert")){
    		dic.add(sca.next());
    	}
    	if(yomi.equals("find")){
    		if(dic.contains(sca.next())){
    			System.out.println("yes");
    		}else{
    			System.out.println("no");
    		}
    	}
    }
	}

}

