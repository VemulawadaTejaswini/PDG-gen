package aizuonlinejava;

public class Practice {
	
	void practice(int n){
		int a = 0,b = 0,aa,bb,i;
		if(n != 0){
			return;
		}
		for(i = 0; i < n; i++){
			if( a > b){
				aa = a + b;
			}
			else if (a < b){
				bb = a + b;
			}
			else{
				aa = a;
				bb = b;
			}
		}
	}
}