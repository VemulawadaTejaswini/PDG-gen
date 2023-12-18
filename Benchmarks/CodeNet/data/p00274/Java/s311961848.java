import java.util.Scanner;
public class Main {
	Scanner sc = new Scanner(System.in);
	int syurui;
	int[] kazu = new int[9999];
    int[] kaisu = new int[9999];
    int kensu;
    int a,b;

    public void kakuritu(){
    	for(kensu=0;kensu<100;kensu++){
    		syurui = sc.nextInt();
    		if(syurui==0){
    			break;
    		}
    		if(syurui==1){
    			for(a=0;syurui>a;a++){
    				kazu[a] = sc.nextInt();
    				if(kazu[a]>=2){
    					kaisu[kensu] = 2;
    				}else{
    					kaisu[kensu] = 0;
    				}
    			}
    		}
    		if(syurui>=2){
    			for(a=0;syurui>a;a++){
    				kazu[a] = sc.nextInt();
    				if(kazu[a]==0){
    					if(a<1){
    						kaisu[kensu] = 0;
    					}else if(kazu[a-1]==1){
    						kaisu[kensu] = 0;
    					}else {kaisu[kensu] = 2;
    					}

    				}
    				if(kazu[a]>=2){
    					if(a<1){
    						kaisu[kensu] = 2;
    					}else if(kazu[a-1]==1){
    						kaisu[kensu] = 2;
    					}else {if(kazu[a-1]>=2){
    						kaisu[kensu] += 1;
    					}
    					}
    			   }
    			}
    		}
    	}
    }

    public void hyouji(){
       for(b=0;b<kensu;b++){
    	   if(kaisu[b]==0){
    		   System.out.println("NA");
    	   }else{System.out.println(kaisu[b]);
    	   
    	   }
       }
    }
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main go = new Main();
		go.kakuritu();
		go.hyouji();
	}

}