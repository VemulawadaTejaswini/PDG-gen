import java.util.Scanner;

public class Main{
    class obj{
	int h, w, n;
	int[] link_x1, link_x2, link_y1, link_y2;
	String str;
	String[] link;
	obj(){
	}
	obj(String str, int h, int w, int n){
	    this.str = str;
	    this.h = h;
	    this.w = w;
	    this.n = n;

	    link = new String[n+1];
	    link_x1 = new int[n+1];
	    link_x2 = new int[n+1];
	    link_y1 = new int[n+1];
	    link_y2 = new int[n+1];
	}

	void setParam(String str, int x1, int x2, int y1, int y2, int m){
	    link[m] = str;
	    link_x1[m] = x1;
	    link_x2[m] = x2;
	    link_y1[m] = y1;
	    link_y2[m] = y2;

	    return ;
	}

	String getPage(int x, int y){
	    for(int i = 0; i < n; i++){
		if(link_x1[i] <= x && x <= link_x2[i] && link_y1[i] <= y && y <= link_y2[i]){
		    return link[i];
		}
	    }
	    return "-1";
	}
    }

    Main(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n = sc.nextInt();
	    if(n == 0){
		break;
	    }
	    int w = sc.nextInt();
	    int h = sc.nextInt();
	    obj[] pages = new obj[n+1];
	    for(int i = 0; i < n; i++){
		String str = sc.next();
		int m = sc.nextInt();
		pages[i] = new obj(str, h, w, m);
		for(int j = 0; j < m; j++){
		    int x1 = sc.nextInt();
		    int y1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int y2 = sc.nextInt();
		    str = sc.next();
		    pages[i].setParam(str, x1, x2, y1, y2, j);
		}
	    }
	    int m = sc.nextInt();
	    String[] state = new String[n+1];
	    int p = 0, q = 0, current = 0;
	    state[p] = pages[current].str;

	    for(int k = 0; k < m; k++){
		String str = sc.next();
		if(str.equals("click")){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    String next = pages[current].getPage(x, y);
		    if(next.equals("-1")){
			continue;
		    }
		    for(int i = 0; i < n; i++){
			if(next.equals(pages[i].str)){
			    current = i;
			    state[++p] = next;
			    break;
			}
		    }
		    q = p;
		} else if(str.equals("show")){
		    System.out.println(state[p]);
		} else if(str.equals("back")){
		    if(p > 0){
			p--;
			for(int i = 0; i < n; i++){
			    if(state[p].equals(pages[i].str)){
				current = i;
				break;
			    }
			}
		    }
		} else {
		    if(p < q){
			p++;
			for(int i = 0; i < n; i++){
			    if(state[p].equals(pages[i].str)){
				current = i;
				break;
			    }
			}
		    }
		}

	    }
	}
    }

    public static void main(String[] args){
	new Main();
    }
}