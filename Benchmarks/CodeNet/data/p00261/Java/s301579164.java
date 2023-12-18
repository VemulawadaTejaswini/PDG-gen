import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    int go=0;
    int pg=0;
    String p="";
    void main(){
	while(true){
	    String p=sc.next();
	    if(p.charAt(0)=='#')break;
	    go=p.length();
	    pg=0;
	    a();
	}
    }
    void a(){
	if(go-pg==0)System.out.println("No");
	else if(p.charAt(pg)=='1'){
	    pg++;
	    y();
	}else if(p.charAt(pg)=='0'){
	    pg++;
	    x();
	}else System.out.println("No");
    }
    void x(){
	if(go-pg==0)System.out.println("No");
	else if(p.charAt(pg)=='1'){
	    pg++;
	    z();
	}else System.out.println("No");
    }
    void y(){
	if(go-pg==0)System.out.println("No");
	else if(p.charAt(pg)=='0'){
	    pg++;
	    x();
	}else System.out.println("No");
    }
    void z(){
	if(go-pg==0)System.out.println("No");
	else if(p.charAt(pg)=='1'){
	    pg++;
	    b();
	}else if(p.charAt(pg)=='0'){
	    pg++;
	    w();
	}else System.out.println("No");
    }
    void w(){
	if(go-pg==0)System.out.println("No");
	else if(p.charAt(pg)=='1'){
	    pg++;
	    y();
	}else if(p.charAt(pg)=='0'){
	    pg++;
	    b();
	}else System.out.println("No");
    }
    void b(){
	if(go-pg==0)System.out.println("Yes");
	else if(p.charAt(pg)=='1'){
	    pg++;
	    x();
	}else if(p.charAt(pg)=='0'){
	    pg++;
	    y();
	}else System.out.println("No");
    }
    public static void main(String[]ag){
	new Main().main();
    }
}