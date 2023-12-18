
import java.util.*;

class Main {
	public static void main(String args[]){
		
		//カード絵柄ごとに配列を用意し、それぞれ１から１３までを格納しておく
		ArrayList cardS = new ArrayList();
		for(int i = 0; i < 13; i++){
			cardS.add(i+1);
		}
		ArrayList cardH = new ArrayList();
		for(int i = 0; i < 13; i++){
			cardH.add(i+1);
		}
		ArrayList cardC = new ArrayList();
		for(int i = 0; i < 13; i++){
			cardC.add(i+1);
		}
		ArrayList cardD = new ArrayList();
		for(int i = 0; i < 13; i++){
			cardD.add(i+1);
		}
		
		Scanner sc = new Scanner(System.in);
		
		//カードの枚数nを受け取る
		String s1 = sc.next();
        int n = Integer.parseInt(s1);
        
        //入力されたカードの絵柄と数字を受け取り配列内の値とそれぞれ比べて、一致したものは配列から削除する
        for(int i = 0; i < n; i++){
        	String E = sc.next();
        	String snum = sc.next();
        	int num = Integer.parseInt(snum);
        	if(E.equals("S")){
        		int jc = cardS.size();
        		for(int j = 0 ; j < jc; j++){
                    if(num == (int)(cardS.get(j))){
        				cardS.remove(j);
        				jc--;
        				j--;
        			}
        		}
        	}
        	
        	else if(E.equals("H")){
        		int jc = cardH.size();
        		for(int j = 0 ; j < jc; j++){
                    if(num == (int)(cardH.get(j))){
        				cardH.remove(j);
        				jc--;
        				j--;
        			}
        		}
        	}
        	else if(E.equals("C")){
        		int jc = cardC.size();
        		for(int j = 0 ; j < jc; j++){
                    if(num == (int)(cardC.get(j))){
        				cardC.remove(j);
        				jc--;
        				j--;
        			}
        		}
        	}
        	else if(E.equals("D")){
        		int jc = cardD.size();
        		for(int j = 0 ; j < jc; j++){
                    if(num == (int)(cardD.get(j))){
        				cardD.remove(j);
        				jc--;
        				j--;
        			}
        		}
        	}
        }
        
        //足りないカードをスペード、ハート、クラブ、ダイヤ、さらに数の小さいものから順に表示していく
        for(int i = 0; i < cardS.size(); i++){
        	System.out.println("S " + cardS.get(i));
        }
        for(int i = 0; i < cardH.size(); i++){
        	System.out.println("H " + cardH.get(i));
        }
        for(int i = 0; i < cardC.size(); i++){
        	System.out.println("C " + cardC.get(i));
        }
        for(int i = 0; i < cardD.size(); i++){
        	System.out.println("D " + cardD.get(i));
        }
        
	}

}