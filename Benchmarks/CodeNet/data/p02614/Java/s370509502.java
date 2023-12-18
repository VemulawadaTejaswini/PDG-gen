import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
      	int h = sc.nextInt();
      	int w = sc.nextInt();
      	int num = sc.nextInt();	
      
      	int w_[] = new int[w];
       	int h_[] = new int[h];
      	int count = 0;
      
      	char ch[][] = new char[w][h];
      	for(int i = 0; i < w; i++){
        	for(int j = 0; j < h; j++){
            	ch[i][j] = sc.next().charAt(0);
              	if(ch[i][j] == '#'){
                	w_[i]++;
                  	h_[j]++;
                  	count++;
                }
            }
        }
      
      	int ans = 0;
      	for(int i = 0; i < w; i++){
        	for(int j = 0; j < h; j++){
            	if(ch[i][j] == '#'){
                  	int tmp = count + 1;
                	if((tmp - (w_[i]+h_[j])) == num){
                    	ans++;
                    }
                }else if((count - (w_[i]+h_[j])) == num){
                    	ans++;
                    }
            }
        }
      
      	if(ans == 0)
          ans++;
      	System.out.println(ans);

    
    }
}