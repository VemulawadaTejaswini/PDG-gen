import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, start, end, ls, le;
    String s;
    int[] words;
    int[][] w;
    boolean ans;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==0) break;

	    words = new int[26];
	    w = new int[26][26]; // start-end
	    ans = true;

	    for(int i=0; i<n; i++){
		s = sc.next();
		char[] c = s.toCharArray();
		
		start = c[0]+'0'-145; // テ・ツセツ古」ツ?ァテ、ツスツソテ」ツ??・ツ、ツ嘉ヲツ閉ー
		end = c[c.length-1]+'0'-145;

		words[start]++;
		words[end]++;
		w[start][end]++;		
	    }
	 
	    // テヲツャツ。テヲツ閉ー-テ・ツ・ツ?ヲツ閉ーテ」ツ??テ、ツサツ・テ、ツクツ凝」ツ?ァテ」ツ?づ」ツつ凝」ツ?禿」ツ?ィテ」ツ??
	    int count = 0;
	    for(int i=0; i<26; i++)
		if(words[i]%2==1) count++;
	    if(count>2) ans = false;

	    // テ」ツつーテ」ツδゥテ」ツδ陛」ツ??..テゥツ?」テァツオツ静」ツ?ァテ」ツ?づ」ツつ凝」ツ?禿」ツ?ィ...
	    search(start, end); // テ、ツクツ?ァツ閉ェテヲツ慊?・ツセツ古」ツ?ォテ・ツ?・テ・ツ環崚」ツ?療」ツ?淌・ツ債佚ィツェツ榲」ツ?凝」ツつ嘉・ツァツ凝」ツつ?」ツつ?
	    boolean fal = false;
	    for(int i=0; i<26; i++)
		for(int k=0; k<26; k++)
		    fal = fal || w[i][k]!=0;
	    if(fal) ans = false;

	    // テヲツ慊?・ツ按敕」ツ?ィテヲツ慊?・ツセツ古」ツ?古ァツュツ嘉」ツ?療」ツ?凝」ツ?」テ」ツ?淌」ツ?凝ッツシツ?
	    ans = ans && start==le;
	    //System.out.println(start+" "+le);

	    //showW();
	    System.out.println(ans ? "OK" : "NG");
	}
    }

    void search(int s, int e){
	if(w[s][e]==0) return;
	//System.out.println("*"+s+" "+e);
	ls = s;
	le = e;
	w[s][e]--;
	int a = 0;
	while(a<26 && w[e][a]<=0) a++;
	if(a<26){
	    search(e, a);
	}
	return;
    }

    void showWords(){
	for(int i=0; i<26; i++)
	    System.out.print(words[i]+" ");
	System.out.println();
	System.out.println("----------");
    } 

    void showW(){
	for(int i=0; i<26; i++){
	    for(int k=0; k<26; k++)
		System.out.print(w[i][k]+" ");
	    System.out.println();
	}
	System.out.println("----------");
    }
}