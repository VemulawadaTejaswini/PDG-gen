//テ・ツ崢崚」ツ?、テ・ツュツ静ァツエツ?ヲツ閉ーテ」ツ?ョテ・ツ、ツァテ」ツ?催」ツ?陛」ツつ津ゥツ?催・ツ按療」ツ?ォテ・ツ?・テ」ツつ古」ツ?淌」ツつ欝ime Limit Exceededテ」ツ?ァテ」ツ?療」ツ??
//テァツ崢エテ」ツ?療」ツ?ヲテ」ツつづァツ崢エテ」ツ?療」ツ?ヲテ」ツつ５ime Limit Exceeded___テ」ツδ嘉」ツδ?」ツδ愿」ツ?ァテ」ツ??
//テ」ツつィテ」ツδゥテ」ツつケテ」ツδ暗」ツδ?」ツδ催」ツつケテ」ツ?ョテァツッツゥテ」ツつ津」ツ?凖」ツ?」テ」ツ?凝」ツつ甘・ツソツ佚」ツつ古」ツ?ヲテ」ツ??」ツ?セテ」ツ?療」ツ?淌」ツ??
//Respect2Dテ」ツ?陛」ツつ禿」ツ?ョテ」ツつウテ」ツδ。テ」ツδウテ」ツδ暗」ツつ津ィツヲツ凝」ツ?ヲテヲツーツ療」ツ?古」ツ?、テ」ツ?催」ツ?セテ」ツ?療」ツ?淌」ツ??

import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);

    static int[] prime = new int[10000001];
    // 0:テヲツ慊ェテ・ツ按、テ・ツョツ?
    // 1:テァツエツ?ヲツ閉ー
    // -1:テァツエツ?ヲツ閉ーテ」ツ?ァテ」ツ?ッテ」ツ?ェテ」ツ??

    public static void main(String[] args){

	prepare();

	while(true){
	    int n = kbd.nextInt();
	    if(n==0) break;
	    solve(n);
	}
    }

    static void prepare(){
	prime[0] = prime[1] = -1;
	int i=2;
	for(; i<prime.length; i++){
	    if(prime[i] == 0){
		prime[i] = 1;
		for(int j=i+i; j<prime.length; j+=i) prime[j]=-1;
	    }
	}
    }

    static void solve(int n){

	while(!(prime[n]==1 && prime[n-2]==1 && prime[n-6]==1 && prime[n-8]==1)){
	    n--;
	}
	System.out.println(n);
    }

    /*
    static boolean prime(int a){
	int k = (int)Math.sqrt(a);
	for(int l=2; l<=k; l++){
	    if(a%l == 0) return false;
	}
	return true;
    }
    */
}