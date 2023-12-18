import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	int tp=0,hp=0;
    	for(int m=sc.nextInt();m>0;m--){
        int ec=0;
    		char[]t=sc.next().toCharArray();
    		char[]h=sc.next().toCharArray();	
        for(int i=0;i<t.length;i++){
        	if(t[i]>h[i]){
        		tp+=3;break;
        	}else if(t[i]<h[i]){
        		hp+=3;break;
        	}else if(t[i]==h[i]) ec++;
        }
        if(ec==t.length){tp++;hp++;}
    }
    System.out.println(tp+" "+hp);
    }
}