import java.util.Scanner;
 
class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
			String ans;
			String[] a ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
			for(int i = 1; i < 27; i++){
        		if(n == i){
                	System.out.println(a[i]);
                }
			}
			for(int i = 1; i < 27; i++){
            	if(n == i+26){
                	System.out.println(a[i]);
            		for(int i = 1; i < 27; i++){
                		System.out.println(a[i]);
                	}
                }
            }
			for(int i = 1; i < 27; i++){
            	if(n == i+702){
                	System.out.print(a[i]);
            		for(int i = 1; i < 27; i++){
                		System.out.print(a[i]);
                    	for(int i = 1; i < 27; i++){
                			System.out.print(a[i]);
                	}
                	}
                }
            }
			for(int i = 1; i < 27; i++){
            	if(n == i+18278){
                	System.out.print(a[i]);
            		for(int i = 1; i < 27; i++){
                		System.out.print(a[i]);
                    	for(int i = 1; i < 27; i++){
                			System.out.print(a[i]);
                        	for(int i = 1; i < 27; i++){
                				System.out.print(a[i]);
                	}
                	}
                	}
                }
            }
			for(int i = 1; i < 27; i++){
            	if(n == i+475254){
                	System.out.print(a[i]);
            		for(int i = 1; i < 27; i++){
                		System.out.print(a[i]);
                    	for(int i = 1; i < 27; i++){
                			System.out.print(a[i]);
                        	for(int i = 1; i < 27; i++){
                				System.out.print(a[i]);
                            	for(int i = 1; i < 27; i++){
                					System.out.print(a[i]);
                				}
                			}
                		}
                	}
                }
            }
    }
}