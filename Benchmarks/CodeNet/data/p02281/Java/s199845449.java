import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main{


	public static void main(String[] args)throws NumberFormatException, IOException{
		InputStreamReader input = new InputStreamReader (System. in);
		BufferedReader buffer = new BufferedReader(input);
		String scan = buffer.readLine();
		long processStart = System.currentTimeMillis();
		Deque<Integer> stack = new ArrayDeque<Integer>();

		int nodeAmount  = Integer.parseInt(scan);
		int[] nodeID    = new int[nodeAmount];
		int[] nodeL     = new int[nodeAmount];
		int[] nodeR     = new int[nodeAmount];
		int[] nodeLeft  = new int[nodeAmount];
		int[] nodeRight = new int[nodeAmount];
		int[] parent    = new int[nodeAmount];
		nodeClass nodeCL = new nodeClass();
		
		
		
		for(int i=0; i<nodeAmount; i++){
			scan = buffer.readLine();
			String[] str = scan.split(" ");
			nodeID[i] = Integer.parseInt(str[0]);
			nodeL[i] = Integer.parseInt(str[1]);
			nodeLeft[nodeID[i]]  = nodeL[i];
			nodeR[i] = Integer.parseInt(str[2]);
			nodeRight[nodeID[i]] = nodeR[i];
			parent[i] = -1;
		}
		
		for(int i=0; i<nodeAmount; i++){		//parent??????????????????
			
			if(nodeLeft[i] > -1){
				parent[nodeLeft[i]]   = i;
				
			}
			if(nodeRight[i] > -1){
				parent[nodeRight[i]]  = i;
				
			}

		}
		
		int isRoot = 0;
		for(int i=0; i<nodeAmount; i++){		//parent????????±??????sibling??????????????????????????§???parent == -1??§??????Root????????????????????????
			if(parent[i] == -1){
				isRoot = i;
			}
		}
		
		stack.add(isRoot);
		boolean[] nodeVisited = new boolean[nodeAmount];
		
		
		int IR = isRoot;
		int[] NL = nodeLeft.clone();
		int[] NR = nodeRight.clone();
		boolean[] NV = nodeVisited.clone();
		System.out.println("Preorder");
		nodeCL.Preorder(IR,NL,NR,NV);
		System.out.println("");
		
		IR = isRoot;
		NL = nodeLeft.clone();
		NR = nodeRight.clone();
		NV = nodeVisited.clone();
		System.out.println("Inorder");
		nodeCL.Inorder(IR,NL,NR,NV);
		System.out.println("");
		
		IR = isRoot;
		NL = nodeLeft.clone();
		NR = nodeRight.clone();
		NV = nodeVisited.clone();
		System.out.println("Postorder");
		nodeCL.Postorder(IR,NL,NR,NV);
		System.out.println("");
		
	}
}


class nodeClass{
	static Deque<Integer> stackPre = new ArrayDeque<Integer>();
	static Deque<Integer> stackPost = new ArrayDeque<Integer>();
	public nodeClass(){
		
	}
	
	void Preorder(int first,int[] left,int[] right,boolean[] visit){
		if(first != -100){
			stackPre.addFirst(first);
		}
		if(!stackPre.isEmpty()){
			int ID = stackPre.peek();
			if(left[ID] != -1){
				if(visit[ID] == false){
					System.out.print(" "+ID);
					visit[ID] = true;
				}
				stackPre.addFirst(left[ID]);
				left[ID] = -1;
				Preorder(-100,left,right,visit);
			}
			if(right[ID] != -1){
				if(visit[ID] == false){
					System.out.print(" "+ID);
					visit[ID] = true;
				}
				stackPre.addFirst(right[ID]);
				right[ID] = -1;
				Preorder(-100,left,right,visit);
			}
			
			else if(right[ID] == -1 && left[ID] == -1){;
				if(visit[ID] == false){
					System.out.print(" "+ID);
					visit[ID] = true;
				}				
				if (!stackPre.isEmpty()){
					stackPre.removeFirst();
					Preorder(-100,left,right,visit);
				}
				else{
					
				}
			}
		}
	}
	
	void Inorder(int first,int[] left,int[] right,boolean[] visit) {
		if(first != -100){
			stackPre.addFirst(first);
		}
		if(!stackPre.isEmpty()){
			int ID = stackPre.peek();
			if(left[ID] != -1){
//				if(visit[ID] == false){
//					System.out.print(" "+ID);
//					visit[ID] = true;
//				}
				stackPre.addFirst(left[ID]);
				left[ID] = -1;
				Inorder(-100,left,right,visit);
			}
			else if(visit[ID] == false){
				
				System.out.print(" "+ID);
				visit[ID] = true;
				
			}
			if(right[ID] != -1){
//				if(visit[ID] == false){
//					System.out.print(" "+ID);
//					visit[ID] = true;
//				}
				stackPre.addFirst(right[ID]);
				right[ID] = -1;
				Inorder(-100,left,right,visit);
			}
			
			else if(right[ID] == -1 && left[ID] == -1){
//				System.out.print("LR -1 ");
//				if(visit[ID] == false){
//					System.out.print(" "+ID);
//					visit[ID] = true;
//				}				
				if (!stackPre.isEmpty()){
					stackPre.removeFirst();
					Inorder(-100,left,right,visit);
				}
				else{
					
				}
			}
		}


	}

	void Postorder(int first,int[] left,int[] right,boolean[] visit){
		if(first != -100){
			stackPre.addFirst(first);
		}
		if(!stackPre.isEmpty()){
			int ID = stackPre.peek();
			if(left[ID] != -1){
				stackPre.addFirst(left[ID]);
				left[ID] = -1;
				Postorder(-100,left,right,visit);
			}
			if(right[ID] != -1){
				stackPre.addFirst(right[ID]);
				right[ID] = -1;
				Postorder(-100,left,right,visit);
			}
			else if(right[ID] == -1 && left[ID] == -1){
				if(visit[ID] == false){
					System.out.print(" "+ID);
					visit[ID] = true;
				}				
				if (!stackPre.isEmpty()){
					stackPre.removeFirst();
					Postorder(-100,left,right,visit);
				}
			}
		}
	}
}