import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    String s;
    String[] w;
    ArrayList<String> list;

    void run(){
	list = new ArrayList<String>();
	s = sc.nextLine();
	w = s.split(" ");
	for(int i=0; i<w.length; i++){
	    String a = w[i].substring(w[i].length()-1, w[i].length());
	    if(a.equals(",") || a.equals("."))
		w[i] = w[i].substring(0, w[i].length()-1);
	    if(w[i].length()>2 && w[i].length()<7 && !list.contains(w[i]))
		list.add(w[i]);
	}
	show();
    }

    void show(){
	Object[] ans = list.toArray();
	for(int i=0; i<ans.length-1; i++)
	    System.out.print(ans[i]+" ");
	System.out.println(ans[ans.length-1]);
    }
}