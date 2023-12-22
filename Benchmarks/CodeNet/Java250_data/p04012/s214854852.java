import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[]ss = S.toCharArray();
    
    int a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, i=0, j=0, k=0, l=0, m=0, o=0, p=0, q=0, r=0, s=0, t=0, u=0, v=0, w=0, x=0, y=0, z=0;
    for(int I=0; I<S.length(); I++) {
    	if(ss[I] == 'a') {
    		a++;
    	}else if(ss[I] == 'b') {
    		b++;
    	}else if(ss[I] == 'c') {
    		c++;
    	}else if(ss[I] == 'd') {
    		d++;
    	}else if(ss[I] == 'e') {
    		e++;    	
    	}else if(ss[I] == 'f') {
    		f++;   	
    	}else if(ss[I] == 'g') {
    		g++;   	
    	}else if(ss[I] == 'h') {
    		h++;   	
    	}else if(ss[I] == 'i') {
    		i++;
    	}else if(ss[I] == 'j') {
    		j++;
    	}else if(ss[I] == 'k') {
    		k++;   	
    	}else if(ss[I] == 'l') {
    		l++;
    	}else if(ss[I] == 'm') {
    		m++;    	
    	}else if(ss[I] == 'o') {
    		o++;
    	}else if(ss[I] == 'p') {
    		p++;
    	}else if(ss[I] == 'q') {
    		q++;   		
    	}else if(ss[I] == 'r') {
    		r++;
    	}else if(ss[I] == 's') {
    		s++;    		
    	}else if(ss[I] == 't') {
    		t++;    		
    	}else if(ss[I] == 'u') {
    		u++;    		
    	}else if(ss[I] == 'v') {
    		v++;    		
    	}else if(ss[I] == 'w') {
    		w++;    		
    	}else if(ss[I] == 'x') {
    		x++;
    	}else if(ss[I] == 'y') {
    		y++;    	
    	}else if(ss[I] == 'z') {
    		z++;   	
    	}
    }
    	if(a%2==0 && b%2==0 && c%2==0 && d%2==0 && e%2==0 && f%2==0 && g%2==0 && h%2==0 && i%2==0 && j%2==0 && k%2==0 && l%2==0 && m%2==0 && o%2==0 && p%2==0 && q%2==0 && r%2==0 && s%2==0 && t%2==0 && u%2==0 && v%2==0 && w%2==0 && x%2==0 && y%2==0 && z%2==0) {
    		System.out.println("Yes");
    	}else {
    	System.out.println("No");
    }
}
    }

