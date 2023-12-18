

import java.util.ArrayList;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		new Main().start();
	}
	ArrayList<Dice> allDice;
	int[] a;
	void start(){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			a = new int[6];
			allDice = new ArrayList<Dice>();
			if(n==0)break;
			for(int i = 0; i < n; i++){
				int t = in.nextInt();
				int f = in.nextInt();
				Dice dz = getDice2(0,0);
				int height = 0;
				if(dz != null) height=dz.z+1;
				Dice d = new Dice(t,f,height);
				d.korogasu();
				allDice.add(d);
			}
			System.out.print(a[0]);
			for(int i = 1; i < a.length; i++){
				System.out.print(" " + a[i]);
			}
			System.out.print("\n");
		}
		in.close();
	}
	Dice getDice(int x, int y, int z){
		for(Dice d : allDice){
			if(x == d.x && d.y == y && d.z == z)return d;
		}
		return null;
	}
	Dice getDice2(int x, int y){
		for(int i = allDice.size()-1; i >= 0; i--){
			Dice d = allDice.get(i);
			if(x == d.x && y == d.y) return d;
		}
		return null;
	}
	class Dice{
		int[]data = new int[6];
		int x,y,z;
		Dice(int t,int f, int z){
			setDice(t,f);
			x = 0;
			y = 0;
			this.z = z;
		}
		void korogasu(){
			while(true){
				if(z == 0){
					a[data[0]-1]++;
					break;
				}
				int max = 0;
				int houkou = 0;
				for(int i = 1; i < 5; i++){
					if(data[i] == 4 || data[i] == 5 || data[i] == 6){
						if(i == 1){
							if(getDice(x,y+1,z-1) == null){
								if(max < data[i]){
									max = data[i];
									houkou = i;
								}
							}
						}else if(i == 2){
							if(getDice(x+1,y,z-1) == null){
								if(max < data[i]){
									max = data[i];
									houkou = i;
								}
							}
						}else if(i == 3){
							if(getDice(x,y-1,z-1) == null){
								if(max < data[i]){
									max = data[i];
									houkou = i;
								}
							}
						}else if(i == 4){
							if(getDice(x-1,y,z-1) == null){
								if(max < data[i]){
									max = data[i];
									houkou = i;
								}
							}
						}
					}
				}
				if(max != 0){
					if(houkou == 1){
						y += 1;
						irekae(1);
					}else if(houkou == 2){
						x += 1;
						irekae(2);
					}else if(houkou == 3){
						y -=1;
						irekae(3);
					}else if(houkou == 4){
						x -= 1;
						irekae(4);
					}
					Dice d = getDice2(x,y);
					if(d != null){
						z = d.z + 1;
					}else{
						z = 0;
					}
				}else{
					a[data[0]-1]++;
					Dice downDice = getDice(x,y,z-1);
					if(downDice != null) a[downDice.data[0]-1]--;
					break;
				}
			}
		}
		void irekae(int i){
			if(i == 1){
				swap(0,1);
				swap(0,3);
				swap(3,5);
			}else if(i == 2){
				swap(0,2);
				swap(0,4);
				swap(4,5);
			}else if(i == 3){
				swap(0,3);
				swap(0,1);
				swap(1,5);
			}else if(i == 4){
				swap(0,4);
				swap(0,2);
				swap(2,5);
			}
		}
		void swap(int i, int j){
			int tmp = data[i];
			data[i] = data[j];
			data[j] = tmp;
		}


		void setDice (int t, int f){
			int r = 0;
			//???????????????????????¨?????????????????????????????£????????§???
			if(t==1 && f==2){
				r = 3;
			}else if(t == 1 && f == 3){
				r = 5;
			}else if(t == 1 && f == 4){
				r = 2;
			}else if(t == 1 && f == 5){
				r = 4;
			}else if(t == 2 && f == 1){
				r = 4;
			}else if(t == 2 && f == 3){
				r = 1;
			}else if(t == 2 && f == 4){
				r = 6;
			}else if(t == 2 && f == 6){
				r = 3;
			}else if(t == 3 && f == 1){
				r = 2;
			}else if(t == 3 && f == 2){
				r = 6;
			}else if(t == 3 && f == 5){
				r = 1;
			}else if(t == 3 && f == 6){
				r = 5;
			}else if(t == 4 && f == 1){
				r = 5;
			}else if(t == 4 && f == 2){
				r = 1;
			}else if(t == 4 && f == 5){
				r = 6;
			}else if(t == 4 && f == 6){
				r = 2;
			}else if(t == 5 && f == 1){
				r = 3;
			}else if(t == 5 && f == 3){
				r = 6;
			}else if(t == 5 && f == 4){
				r = 1;
			}else if(t == 5 && f == 6){
				r = 4;
			}else if(t == 6 && f == 2){
				r = 4;
			}else if(t == 6 && f == 3){
				r = 2;
			}else if(t == 6 && f == 4){
				r = 5;
			}else if(t == 6 && f == 5){
				r = 3;
			}
			data[0] = t;	//??????
			data[1] = f;	//???
			data[2] = r;	//???
			data[3] = 7-f;	//??????
			data[4] = 7-r;	//?????????
			data[5] = 7-t;	//???
		}
	}

}