import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Node[] nodes = input();
		StringBuilder stringBuilder = new StringBuilder();
		for (Node node : nodes) {
			stringBuilder.append("node " + node.getId());
			stringBuilder.append(": parent = " + node.getParent());
			stringBuilder.append(", depth = " + node.getDepth());
			stringBuilder.append(", " + node.getType());
			stringBuilder.append(", [");
			for (int j = 0; j < node.getChildren().size(); j++) {
				if (j != 0) {
					stringBuilder.append(", ");
				}
				stringBuilder.append(node.getChildren().get(j).getId());
			}
			stringBuilder.append("]\n");
		}
		System.out.println(stringBuilder);
		
	}
	
	public static Node[] input() throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bufferedReader.readLine());
		Node[] nodes = new Node[num];
		for (int i = 0; i < num; i++) {
			nodes[i] = new Node(i);
		}
		for (int i = 0; i < num; i++) {
			String[] elements = bufferedReader.readLine().split(" ");
			int id = Integer.parseInt(elements[0]);
			int nextNum = Integer.parseInt(elements[1]);
			nodes[id].setId(id);
			List<Node> children = new ArrayList<>();
			for (int j = 0; j < nextNum; j++) {
				int element = Integer.parseInt(elements[j + 2]);
				children.add(nodes[element]);
				nodes[element].setParent(nodes[id]);
			}
			nodes[id].setChildren(children);
		}
		return nodes;
	}

}
class Node {
	/** ??????????????§??? */
	private int id = -1;
	/** ????????????????????§??? */
	private Node parent;
	/** ?????????????????????????????§??? */
	private List<Node> children = new ArrayList<>();
	public Node(int id) {
		this.id = id;
		if (id != -1) {
			parent = new Node(-1);
		}
	}
	
	public int getDepth() {
		if (id == -1) {
			return 0;
		} else {
			return parent.getDepth() + 1;
		}
	}
	
	public String getType() {
		if (parent.getId() == -1) {
			return "root";
		} else if (children.isEmpty()) {
			return "leaf";
		} else {
			return "internal node";
		}
	}

	/**
	 * ????????????????????????
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * ???????????????????????????
	 * @param id ??????????????? id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * ?????????????????????
	 * @return parent
	 */
	public Node getParent() {
		return parent;
	}

	/**
	 * ????????????????????????
	 * @param parent ??????????????? parent
	 */
	public void setParent(Node parent) {
		this.parent = parent;
	}

	/**
	 * ??????????????????????????????
	 * @return children
	 */
	public List<Node> getChildren() {
		return children;
	}

	/**
	 * ????????????????????????
	 * @param children ??????????????? children
	 */
	public void setChildren(List<Node> children) {
		this.children = children;
	}

}