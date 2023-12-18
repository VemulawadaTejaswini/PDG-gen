import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public BufferedReader br;

	/**
	 * メイン処理
	 * @throws IOException
	 */
	public void Proc() throws IOException {
		int commandCount = Integer.parseInt(br.readLine());
		int itemCount = 0;
		Node first = null;
		Node last = null;
		for(int i=0; i<commandCount; i++) {
			String[] inpt = br.readLine().split(" ");
			int num = 0;
			if(inpt.length > 1) {
				num = Integer.parseInt(inpt[1]);
			}
			if(inpt[0].equals("insert")) {
				Node n = new Node();
				n.Number = num;
				if(first != null) {
					first.Prev = n;
					n.Next = first;
				}
				first = n;
				if(last == null) {
					last = n;
				}
				itemCount++;
			} else if(inpt[0].equals("delete")) {
				if(first != null) {
					Node target = first.Next;
					while(target != null) {
						if(target.Number == num) {
							if(target.Prev != null && target.Next != null) {
								target.Prev.Next = target.Next;
								target.Next.Prev = target.Prev;
							} else if(target.Prev != null) {
								target.Prev.Next = null;
							} else if(target.Next != null) {
								target.Next.Prev = null;
							}
							if(target.Next == null) {
								last = target.Prev;
							}
							itemCount--;
							break;
						} else {
							target = target.Next;
						}
					}
				}
			} else if(inpt[0].equals("deleteFirst")) {
				if(first != null) {
					if(first.Next != null) {
						first.Next.Prev = null;
					}
					first = first.Next;
					itemCount--;
				}
			} else if(inpt[0].equals("deleteLast")) {
				if(last != null) {
					if(last.Prev != null) {
						last.Prev.Next = null;
					}
					last = last.Prev;
					itemCount--;
				}
			}
		}

		Node nd = first;
		StringBuilder ans = new StringBuilder();
		while(nd != null) {
			if(ans.length() > 0) {
				ans.append(" ");
			}
			ans.append(nd.Number);
			nd = nd.Next;
		}
		System.out.println(ans.toString());
	}

	public class Node {
		public int Number ;
		public Node Next = null;
		public Node Prev = null;
	}


	public static void main(String[] args)  {
		Main mn = new Main();
		mn.br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		try {
			mn.Proc();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			try {
				mn.br.close();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}


}