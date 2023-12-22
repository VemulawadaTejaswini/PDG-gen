import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	int tp=0,hp=0;
    	for(int m=sc.nextInt();m>0;m--){
        int ec=0;
    		char[]t=sc.next().toCharArray();
    		char[]h=sc.next().toCharArray();	
        for(int i=0;i<Math.min(t.length,h.length);i++){
        	if(t[i]>h[i]){
        		tp+=3;break;
        	}else if(t[i]<h[i]){
        		hp+=3;break;
        	}else if(t[i]==h[i]) ec++;
        }
        if(ec==Math.min(t.length,h.length)){
        	if(t.length>h.length){tp+=3;}
        	else if(t.length<h.length){hp+=3;}
        	else{tp++;hp++;} 	
        }
    }
    System.out.println(tp+" "+hp);
    }
}