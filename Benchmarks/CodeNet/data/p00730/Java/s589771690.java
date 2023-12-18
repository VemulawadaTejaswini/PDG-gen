
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main 
{
	static class C implements Comparator<Piece>
	{

		@Override
		public int compare(Piece arg0, Piece arg1) 
		{
			return (arg0.y - arg1.y)*10000 + arg0.x - arg1.y;
		}
		
	}
	
	static class Piece
	{
		int x = 0;
		int y = 0;
		int w = 0;
		int h = 0;
		
		public Piece()
		{
		}
		
		public Piece(int x0, int y0, int w0, int h0)
		{
			x = x0;
			y = y0;
			w = w0;
			h = h0;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int n = sc.nextInt();
			
			int w = sc.nextInt();
			int h = sc.nextInt();
			
			if(n == 0 && w == 0 && h == 0)return;
			
			LinkedList<Piece> pc = new LinkedList<>();
			
			pc.add(new Piece(0,0,w,h));
			
			if(w == 0 || h == 0)
			{
				for(int i = 0; i <= n; i++)
				{
					if(i > 0)System.out.print(" ");
					System.out.print(0);
				}
				System.out.print("\n");
			}
			else
			{
				for(int i = 1; i <= n; i++) //i will be the index of the new piece
				{
					int tar = sc.nextInt()-1;
					
					int pos = sc.nextInt();
					
					int in = pos;
					
					Piece temp = pc.get(tar);
					
					int circ = temp.h*2 + temp.w*2;
					
					pos = pos%circ;
					if(pos < 0)pos += circ;
					
					int px = 0;
					int py = 0;
					
					int dir = 0; //travel to the right
					
					
		//			System.out.println("Gonna cut " + pc[tar].w + " " + pc[tar].h);
					
					//go to the right
					if(pos <= temp.w) //stop here, slice down
					{
						px = pos;
						
						if(py == 0 || temp.h - py == 0)
						{
//							System.out.println("ZERO CUT1");
						}
						
		//				System.out.println("px " + px);
						//make both new pieces
						if(px * 2 > temp.w) //left is bigger, so left is new
						{
							pc.add(new Piece(temp.x + px, temp.y, temp.w - px, temp.h));
							pc.add(new Piece(temp.x, temp.y, px, temp.h));
						}
						else
						{
		//					System.out.println("Right is bigger");
							pc.add(new Piece(temp.x, temp.y, px, temp.h));
							pc.add(new Piece(temp.x + px, temp.y, temp.w - px, temp.h));
						}		
		//				System.out.println("Cut down!");
						
		//				Piece left = new Piece(pc[tar].x, pc[tar].y, px, pc[tar].h);
		//				Piece right = new Piece(pc[tar].x + px, pc[tar].y, pc[tar].w - px, pc[tar].h);
					}
					else
					{
						px = temp.w;
						pos -= temp.w; //go all the way to the right.
						//then go down with the remaining pos.
						
						
						if(pos <= temp.h) //stop here, slice left
						{
							py = pos;
							
							if(py == 0 || temp.h - py == 0)
							{
//								System.out.println("ZERO CUT 2: " + py + ", " + temp.h);
//								System.out.println("in " + in + ", " + temp.w + " " + temp.h);
							}
							
							//make both new pieces
							if(py * 2 > temp.h) //up is bigger, so up is new, down (small) is old
							{
								pc.add(new Piece(temp.x, temp.y + py, temp.w, temp.h - py));
								pc.add(new Piece(temp.x, temp.y, temp.w, py));
							}
							else
							{
								pc.add(new Piece(temp.x, temp.y, temp.w, py));
								pc.add(new Piece(temp.x, temp.y + py, temp.w, temp.h - py));
							}							
						}
						else
						{
							py = temp.h;
							pos -= temp.h;
							//go all the way to down, then go left with remaining.
							if(pos <= temp.w)
							{
								px -= pos;
								//stop here, slice up
								
								if(px == 0 || temp.w - px == 0)
								{
//									System.out.println("ZERO CUT 3: " + px + ", " + temp.w);
//									System.out.println("in " + in + ", " + temp.w + " " + temp.h);
								}
								
								//make both new pieces
								if(px * 2 > temp.w) //left is bigger, so left is new
								{
									pc.add(new Piece(temp.x + px, temp.y, temp.w - px, temp.h));
									pc.add(new Piece(temp.x, temp.y, px, temp.h));
								}
								else
								{
				//					System.out.println("Right is bigger");
									pc.add(new Piece(temp.x, temp.y, px, temp.h));
									pc.add(new Piece(temp.x + px, temp.y, temp.w - px, temp.h));
								}						
								
							}
							else
							{ //go all the way left, then go up with remaining.
								pos -= temp.w;
								
								px = 0;
								py = temp.h - pos;
								
								if(py == 0 || temp.h - py == 0)
								{
//									System.out.println("ZERO CUT");
								}
								//slice right from here.
								
//								System.out.println("Slice right " + py + ", pos "  + pos);
								
								//make both new pieces
								if(py * 2 > temp.h) //up is bigger, so up is new, down (small) is old
								{
									pc.add(new Piece(temp.x, temp.y + py, temp.w, temp.h - py));
									pc.add(new Piece(temp.x, temp.y, temp.w, py));
								}
								else
								{
									pc.add(new Piece(temp.x, temp.y, temp.w, py));
									pc.add(new Piece(temp.x, temp.y + py, temp.w, temp.h - py));
								}						
							}
							
							
						}
						
					}
					
					pc.remove(tar);
//					System.out.println("Cut into " + pc.get(pc.size()-1).w*pc.get(pc.size()-1).h + " and " + pc.get(pc.size()-2).w*pc.get(pc.size()-2).h);
//					System.out.println("Cut into " + pc[tar].w + " " + pc[tar].h + " and " + pc[i].w + " " + pc[i].h);
					
					if(pos > 0)
					{
						
					}
				}
				
				int[] a = new int[n+1];
				for(int i = 0; i <= n; i++)
				{
					a[i] = pc.get(i).w * pc.get(i).h;
				}
				
				Arrays.sort(a);
				
				for(int i = 0; i <= n; i++)
				{
					if(i > 0)System.out.print(" ");
					System.out.print(a[i]);
				}
				System.out.print("\n");
			}
		}
	}

}

