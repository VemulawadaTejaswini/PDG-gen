import java.util.Scanner;
public class Main
{
    
    void run()
    {
	
	String[] kang = {"a", "b", "c", "d", "e", "f", "g", "h",
			 "i", "j", "k", "l", "m", "n", "o", "p",
			 "q", "r", "s", "t", "u", "v", "w", "x", 
			 "y","z", 
			 "ld", "mb", "mp", "nc", "nd", "ng", "nt",
			 "nw", "ps", "qu", "cw","ts","B"}; 
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[][] ans=new int[kang.length][kang.length];
	while(sc.hasNext()){
	    String str=(sc.next()+"A");
	    String temp;
	    int front=kang.length -1; //B
	    //System.out.println(str);
	    
	    for(int i=0;i<str.length()-1;i++){
		for(int j=kang.length-2;j>=0;j--){
		    temp=str.substring(i,i+kang[j].length());
		    //  System.out.println(kang[j]+" "+temp);
		    if(kang[j].equals(temp)){
			ans[front][j]++;
			front = j;
			i+=kang[j].length()-1;
			break;
		    }
		}
	    }
	}
	for(int i=0;i<kang.length-1;i++){
	    int max=0;
	    for(int j=0;j<kang.length-1;j++){
		max= ans[i][max] >=ans[i][j] ? max:j;
	    }
	    System.out.println(kang[i]+" "+kang[max]+" "+ans[i][max]);
	}
    }
	
    public static void main(String[] args)
    {
	new Main().run();	
    }
}